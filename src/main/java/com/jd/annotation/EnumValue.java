package com.jd.annotation;


import org.apache.ibatis.javassist.Modifier;
import org.assertj.core.util.Strings;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 自定义注解需要实现ConstraintValidator校验类，这里我们定义一个叫Validator的类来实现它，同时实现它下面的两个方法initialize、isValid
 * ，一个是初始化参数的方法，另一个就是校验逻辑的方法，本例子中我们将校验类定义在该注解内，用@Constraint(validatedBy = EnumValue.Validator.class)
 * 注解指定校验类，内部逻辑实现比较简单就是使用了静态类反射调用验证方法的方式。
 * 对于被校验的方法我们要求，它必须是返回值类型为Boolean或boolean，并且必须是一个静态的方法，返回返回值为null时我们认为是校验不通过的，按false逻辑走。
 */

/**
 * @author zhumaer
 * @desc 校验枚举值有效性
 * @since 10/17/2017 3:13 PM
 */
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EnumValue.Validator.class)
public @interface EnumValue {
    String message() default "{custom.value.invalid}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    Class<? extends Enum<?>> enumClass();

    String enumMethod();

    class Validator implements ConstraintValidator<EnumValue, Object> {

        private Class<? extends Enum<?>> enumClass;
        private String enumMethod;

        @Override
        public void initialize(EnumValue enumValue) {
            enumMethod = enumValue.enumMethod();
            enumClass = enumValue.enumClass();
        }

        @Override
        public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {
            if (value == null) {
                return Boolean.TRUE;
            }

            if (enumClass == null || enumMethod == null) {
                return Boolean.TRUE;
            }

            Class<?> valueClass = value.getClass();

            try {
                Method method = enumClass.getMethod(enumMethod, valueClass);
                if (!Boolean.TYPE.equals(method.getReturnType()) && !Boolean.class.equals(method.getReturnType())) {
                    throw new RuntimeException(Strings.formatIfArgs("%s method return is not " +
                            "boolean type in the %s class", enumMethod, enumClass));
                }

                if (!Modifier.isStatic(method.getModifiers())) {
                    throw new RuntimeException(Strings.formatIfArgs("%s method is not static method in the %s class",
                            enumMethod, enumClass));
                }

                Boolean result = (Boolean) method.invoke(null, value);
                return result == null ? false : result;
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException | SecurityException e) {
                throw new RuntimeException(Strings.formatIfArgs("This %s(%s) method does not exist in the %s",
                        enumMethod, valueClass, enumClass), e);
            }
        }

    }
}
