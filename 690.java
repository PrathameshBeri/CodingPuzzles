//690

/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {

        List<Integer> ii = new ArrayList<>();
        ii.add(id);
        int importance = getImportance(employees, ii);
        return importance;
    }


    int getImportance(List<Employee> employees, List<Integer> subs){

        int imp = 0;
       if(subs.isEmpty()) return 0;

        for(Employee e : employees){
            if(subs.contains(e.id)){
                imp += getImportance(employees, e.subordinates);
                imp += e.importance;
            }
        }
        return imp;
    }
}
