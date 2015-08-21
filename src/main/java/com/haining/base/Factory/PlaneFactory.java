package com.haining.base.Factory;

import com.haining.base.Factory.bean.IPlane;
import com.haining.base.Factory.bean.PlaneA;
import com.haining.base.Factory.bean.PlaneB;

/**
 * Created by haining on 15/8/11.
 */
public class PlaneFactory {
    public static IPlane getPlane() throws Exception {
        if (true){
            return new PlaneA();
        } else {
            return new PlaneB();
        }
    }
}
