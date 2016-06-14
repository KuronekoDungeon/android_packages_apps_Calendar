/*
 * Copyright (C) 2012 - 2015 The MoKee OpenSource Project
 * Copyright (C) 2015 The SudaMod Project  
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.suda.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

import java.text.DecimalFormat;
import java.util.Locale;

/**
* @hide
*/

public class SudaUtils {

    //2016年法定节假日
    //一月
    private static int[] JANH = {1, 2, 3};
    //二月
    private static int[] FEBH = {7, 8, 9, 10, 11, 12, 13};
    //四月
    private static int[] APRH = {2, 3, 4, 30};
    //五月
    private static int[] MAYH = {1, 2};
    //六月
    private static int[] JUNH = {9, 10, 11};
    //九月
    private static int[] SEPH = {15, 16, 17};
    //十月
    private static int[] OCTH = {1, 2, 3, 4, 5, 6, 7};

    //public static native boolean isSupportLanguage(boolean excludeTW);
    public static boolean isSupportLanguage(boolean excludeTW){
        boolean return_value = false;
        String deviceLocale=Locale.getDefault().getLanguage();
        String deviceCountry=Locale.getDefault().getCountry();
        if ( deviceLocale.equals("zh") ) {
            if ( deviceCountry.equals("TW") && excludeTW ) return_value = false;
            else return_value = true;
        }
        return return_value;
    }

    public static boolean isChineseHoliday(int y, int m, int d) {
        boolean bResult = false;
        if( y == 2016 ){
            switch(m) {
                case 1:
                  for(int tmp:JANH){
                      if(d == tmp) bResult=true;
                  }
                break;
                case 2:
                  for(int tmp:FEBH){
                      if(d == tmp) bResult=true;
                  }
                break;
                case 3:
                break;
                case 4:
                  for(int tmp:APRH){
                      if(d == tmp) bResult=true;
                  }
                break;
                case 5:
                  for(int tmp:MAYH){
                      if(d == tmp) bResult=true;
                  }
                break;
                case 6:
                  for(int tmp:JUNH){
                      if(d == tmp) bResult=true;
                  }
                break;
                case 7:
                break;
                case 8:
                break;
                case 9:
                  for(int tmp:SEPH){
                      if(d == tmp) bResult=true;
                  }
                break;
                case 10:
                  for(int tmp:OCTH){
                      if(d == tmp) bResult=true;
                  }
                break;
                case 11:
                break;
                case 12:
                break;
            }
        }
        return bResult;
    }

}
