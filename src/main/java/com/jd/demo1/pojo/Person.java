package com.jd.demo1.pojo;

import com.jd.annotation.EnumValue;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Person implements Serializable {
    private static final long serialVersionUID = 2594274431751408585L;

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 登录密码
     */
    @NotBlank
    private String pwd;

    /**
     * 昵称
     */
    @NotBlank
    @Length(min = 1, max = 64)
    private String nickname;

    /**
     * 头像
     */
    private String img;

    /**
     * 电话
     */
    @Pattern(regexp = "^1[3-9]\\d{9}$")
    private String phone;

    @EnumValue(enumClass = PersonStatusEnum.class,enumMethod = "isValidName")
    private String status;


    /**
     * 最新的登录IP
     */
    private String latestLoginIp;

    private Date createTime;
    private Date updateTime;

    /**
     * 用户状态枚举
     */
    public enum PersonStatusEnum {
        /**
         * 正常的
         */
        NORMAL,
        /**
         * 禁用的
         */
        DISABLED,
        /**
         * 已删除的
         */
        DELETED;

        /**
         * 判断参数合法性
         */
        public static boolean isValidName(String name) {
            for (PersonStatusEnum PersonStatusEnum : PersonStatusEnum.values()) {
                if (PersonStatusEnum.name().equals(name)) {
                    return true;
                }
            }
            return false;
        }
    }
}
