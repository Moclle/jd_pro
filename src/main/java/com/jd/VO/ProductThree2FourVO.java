package com.jd.VO;

import com.jd.pojo.Productfour;
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
public class ProductThree2FourVO extends Productthree {
    List<Productfour> productfourList;
}
