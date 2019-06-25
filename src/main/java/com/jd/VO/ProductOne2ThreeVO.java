package com.jd.VO;

import com.jd.pojo.Productone;
import com.jd.pojo.Productthree;
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
public class ProductOne2ThreeVO extends Productone {
    private List<Productthree> productthreeList;
}
