package com.jd.VO;

import com.jd.pojo.Productone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ProductOne2ThreeAndFourVO extends Productone {
    private List<ProductOne2ThreeVO> productOne2ThreeVOList;
}
