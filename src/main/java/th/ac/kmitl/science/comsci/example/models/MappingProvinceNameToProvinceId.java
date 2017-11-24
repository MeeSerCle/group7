/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.kmitl.science.comsci.example.models;

/**
 *
 * @author user1
 */
public class MappingProvinceNameToProvinceId {
    
    
    
    public int mappingProvinceNameToProvinceId(String provinceName){
        
		private int provinceId;

        switch(provinceName){

            case "Bangkok" : provinceId = 10;

            default : provinceId = 0;
        }
        
        return provinceId;
    }
    
}
