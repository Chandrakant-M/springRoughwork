class Employee{
  String eid;
  String ename;
  Address addr;  // HAS-A relationship. Employee HAS An address
  
  //High coupling
  Employee(){
  eid="01";
  ename="Ram";
  addr=new Address(); // high coupling. construction of Address object depends on Employee object.
  }
  
  //Low coupling
  Employee(Address addrref){
  eid="01";
  ename="Ram";
  addr=addrref; // low coupling. construction of Address object does not depend on Employee object.
  }
  
}
class Address{
  String city;
  String bldg;
  int pincode;
}
