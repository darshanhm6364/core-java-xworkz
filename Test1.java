1)expain java and javac?
 encapsulation
java is a objected oriented programing languange
it revalves around the camcept of class and objects it allows devolpers  to craete  reuseable code through encapsulatiob  inhertance and polymorphism

jabac- java is platform independent this is possible becouse  the java compilar is compiled to platform independent byecode where bytecode is excuted using java virital machine


2)      expain jdk,jre,jvm?

jdk-java devolpment kit


jdk=jre+document kit(comilpar,debuggeer java c)

 it is physicaly exits
 
 jre=java runtime enivernment 
 
 jre=jvm+setoflibraries
 
 it is physically exists
 
 jvm=java virtial machine 
 
 loads  the byecode 
 verify the bytecode
 excute the bytecode
 provid runtime enivernment
 
 it is physically not exists
 
 3)    list the limations of array?
 
 array element cannot modifier directyly
 when we set the size of the array we can modifier
 
 4)  expain class.object and signature and class file?
 
  class-a class is blueprint or templete that defines the strucure and behivar of the object
  object--a object is instance  of a class reprsenting entities the proparties and behavirs singnature of the class  -public class className
  //classbody-method vareable and canstructar
  
  5) different between.java file and class file?
  
  .java                                                                     .class
                                                                         it is byte code(converted from sourse code)
  it is sourse code                                                its is written bye java campilar
  its is written by the users                                    the code will be english language but enterected will be bytecode to machinme code when the opertaing system can understand
  the code will be english language
  
 6) explain the method signatur?
 
 access  modifer returns type method name(parameter)
 
 7) what is java ?
 
 java is highlevel object oriented programing langwage
 
 8) list the java IDE's?
 
 intellij-idea
 ecclipse
 comindline
 
 9) what is variable ?explain it types
 
 it is continer for storing  valve
 
 local vareable 
 instance varebale
 static vareable
 
 local vareable= a varebale declared inside the body of the method 
 
 public static void main() {
 
   int localVar=20;
 }
 
 instance vareable=a vareable declared inside the class but outside the body of the method
 
      public class className(){
	   int instanceVar=18;
	  }
 static vareable = a vareable that is decaled as static
 
 
   public class className(){
   
    int statiVar=10;
   }
   
   10) list 15 java keyWords?
   
         if.for.while.doWhile.elseIf.break.shart.double.long.int .float.boolean.byte.char.
		 
		 
	11)   what is a class vareable?

class level vareable are static and instance

    12)  what is data type and explian its type?

       dataType==type of data stored in vareable is called datatype


        dataTypes dived by 2 group 

        primative datType

        nonPrimetive dataType

      primitive dataTypes  includs=(shart.double.long.int .float.boolean.byte.char)
	  this datatypes have fixed range and dont have addicated or special method
                               	  
		nonPrimetive datType  includs=(String.Array.class. inetrface........etc)          
      this datatype have addicated or special method like equals(),toString(),hashcode
	  
	 13) what is dotOperater? 
	 
	 dot operated is a buildoperater .which is used to perform some action or taskses we use this in canditinal statement to check between two String
	 
	 String name1="darshan";
	 String name2="darshan";
	 
	 name1.equals(name2)==true;
	 
	 ex we use this in canstuctar refernce like
	 
	 public canstutar(int age ,String name){
	 ClassName ref=new ClassName();
	
	 }
	 14) list the java features?
	 
	 simple
	 object orented
	 platformIndependent
	 secure
	 protable
	 high performance
	 dynomic
	 
	 
	 15)what is the base class of all the classes?
	 
	 16) what is method overloading?
	 method overloading allpows the declartion of multiple method with the same name but diffrent parameter the mehod must have diffrent types parameter length
	   
	 public class Name{
	 
	 public int add(int num1,int num2){
	 
	 return num1+num2;
	 
	 }
	  public int add(int num1,int num2,int num3){
	  
	  return num1+num3;
	  }
	 }
	 public static void main(String args[]){
	 
	 calclecton cal=new  calclecton();
	 
	 int.result1=cal (3.4)
	 sop(result1);
	 
	 int result2=cal.add(1.2.3);
	 sop(result2);
	 
	 }
	  