package iteration;

public class Args {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);    //
		System.out.println(args[2]);    //we can also use same index more than one 
		System.out.println(args[3]);
		
	
		
}

}

//run -> run configuration -> Arguments -> Program Arguments 
//then give arguments and run the program
//if in case of run the program inside the cmd then  1. javac Args.java  2. java Args main hello 111 bye 
//here after the java Args write main and then write your required command line arguments with spaace separated.
//write the args[] from '0' index and if you are using 4 args (i.e from index 0->3) then also pass 4 argumnts
//else  it will show a error " java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4"