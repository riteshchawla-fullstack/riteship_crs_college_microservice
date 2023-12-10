package com.riteship.crs.college.microservice.model.convertor;

import com.riteship.crs.college.microservice.dtos.CollegeDataBeanDTO;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollegeDataBeanCovertor {

    public static List<CollegeDataBeanDTO> convertCollegeDataListToCollegeDataBean(ArrayList collegeDataList) {
        List<CollegeDataBeanDTO> collegeDataBeanDTOS = new ArrayList<>();
        if(!CollectionUtils.isEmpty(collegeDataList)) {
            collegeDataList.stream().forEach(data -> {
                if(data != null) {
                    HashMap collegeData = (HashMap) data;
                    if(!CollectionUtils.isEmpty(collegeData)) {
                        CollegeDataBeanDTO collegeDataBeanDTO = getCollegeDataBeanDTOFromDataMap(collegeData);
                        if(collegeDataBeanDTO != null) {
                            collegeDataBeanDTOS.add(collegeDataBeanDTO);
                        }
                    }
                }
            });
        }
        return collegeDataBeanDTOS;
    }

    public static CollegeDataBeanDTO getCollegeDataBeanDTOFromDataMap(HashMap collegeData) {
        CollegeDataBeanDTO collegeDataBeanDTO = null;
        if(!CollectionUtils.isEmpty(collegeData)) {
            collegeDataBeanDTO = new CollegeDataBeanDTO();
            collegeDataBeanDTO.setCollegeCity((String)collegeData.get("college_city"));
            collegeDataBeanDTO.setCollegeState((String)collegeData.get("college_state"));
            collegeDataBeanDTO.setCollegeCountry((String)collegeData.get("college_country"));
            collegeDataBeanDTO.setCollegeMobile((String)collegeData.get("college_mobile"));
            collegeDataBeanDTO.setCollegeAddress((String)collegeData.get("college_address"));
            collegeDataBeanDTO.setCollegeId(Integer.valueOf((String)collegeData.get("college_id")));
            collegeDataBeanDTO.setCollegeDescription((String)collegeData.get("college_email"));
            collegeDataBeanDTO.setCollegeEmail((String)collegeData.get("college_description"));
            collegeDataBeanDTO.setCollegeWebsite((String)collegeData.get("college_website"));
            collegeDataBeanDTO.setCollegeImage((String)collegeData.get("college_image"));
            collegeDataBeanDTO.setCollegeName((String)collegeData.get("college_name"));
            //collegeDataBeanDTO.setC((String)collegeData.get("college_website"));

        }
        return collegeDataBeanDTO;
    }

    public static Map<String, String> getMapOfCollegeDataFromCollegeDataBean(CollegeDataBeanDTO collegeDataBeanDTO) {
        Map<String, String> result = new HashMap<>();
        if(collegeDataBeanDTO != null) {
            result.put("college_id", String.valueOf(collegeDataBeanDTO.getCollegeId()));
            result.put("college_state", collegeDataBeanDTO.getCollegeState());
            result.put("college_country", collegeDataBeanDTO.getCollegeCountry());
            result.put("college_mobile", collegeDataBeanDTO.getCollegeMobile());
            result.put("college_address", collegeDataBeanDTO.getCollegeAddress());
            result.put("college_id", String.valueOf(collegeDataBeanDTO.getCollegeId()));
            result.put("college_email", collegeDataBeanDTO.getCollegeEmail());
            result.put("college_description", collegeDataBeanDTO.getCollegeDescription());
            result.put("college_website", collegeDataBeanDTO.getCollegeWebsite());
            result.put("college_image", collegeDataBeanDTO.getCollegeImage());
            result.put("college_city", collegeDataBeanDTO.getCollegeCity());
        }
        return result;
    }
}
