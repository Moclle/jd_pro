package com.jd.VO;

import com.jd.pojo.Productone;
import com.jd.pojo.Producttwo;
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
public class ProductOne2TwoVO extends Productone {
    public List<Producttwo> producttwoList;
}
