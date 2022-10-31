package by.itacademy.hometask.appliance.dao.impl;

import by.itacademy.hometask.appliance.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ApplianceDataMatcher {

    private List<String> dataFromSource;
    private Criteria criteria;

    public ApplianceDataMatcher(List<String> dataFromSource, Criteria criteria) {
        this.dataFromSource = dataFromSource;
        this.criteria = criteria;
    }

    public List<String> match() {
        List<String> applianceDataResult = new ArrayList<>();
        List<String> searchPatterns = formFindPattern();
        for (String data : dataFromSource) {
          //  System.out.println("+++++++++++++"+data);
            if (checkToPatterns(data, searchPatterns)) {

                applianceDataResult.add(data);
//                System.out.println("]]]]]]]]]]]]]"+"  applianceDataResult");
//                System.out.println(applianceDataResult);

            }

        }
      //  System.out.println("applianceDataResult"+applianceDataResult);

        return applianceDataResult;
    }

    private List<String> formFindPattern() {

        List<String> searchPattern = new ArrayList<>();
        Map<String,Object> formCriteria = criteria.getCriteria();
        Set<String> keys =formCriteria.keySet();        // возврат значений, которые ищем

            // создаем поисковый паттерн для поиска полного совпадения по параметру и значению
        // напрамер CAPACITY=3
        for (String key : keys) {
            String pattern = key + "="+ formCriteria.get(key);
           // System.out.println("pattern--"+ pattern);
            searchPattern.add(pattern);
        }

        return searchPattern;


    }

    private boolean checkToPatterns(String data, List<String> searchPatterns) {

        for (String pattern : searchPatterns) {

            if (!data.contains(pattern)) {
                return false;
            }

            }
            return true;
        }


    }

