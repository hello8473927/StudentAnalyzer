public class StudentAnalyzer{
  private ArrayList<Student> studentList;

  public StudentAnalyzer(ArrayList<Student> list){
    studentList = list;
  }

  public int countAbove(int threshold){
    int count = 0;
    for(int i = 0; i < studentList.size(); i++){
      if(studentList.get(i).getMarks() > threshold){
        count++;
      }
    }
    return count;
  }

  public void removeFailing(int passMark){
    for(int i = 0; i < studentList.size(); i++){
      if(studentList.get(i).getMarks() < passMark){
        studentList.remove(i);
        i--;
      }
    }
  }

  public Student findTopStudent(){
    Student max = studentList.get(0);
    for(int i = 0; i < studentList.size(); i++){
      if(studentList.get(i).getMarks() > max.getMarks()){
        max = studentList.get(i);
      }
    }
    return max;
  }
}
