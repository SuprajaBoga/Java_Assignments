package com.assignments.java;

class Employee
{
    String name;
    String mobile;
    String password;

    public Employee(String name, String mobile, String password)
    {
        try {
            if(name == null || "".equals(name)){
                throw new EmptyNameException("Employee name cannot be empty");
            }
            if(mobile == null || mobile.length() != 10)
            {
                throw new MobileNumberFormatException("Mobile number should be 10-digit numeric string");
            }
            if(password.length() < 8)
            {
                throw new PasswordFormatException("Password should be minimum 8 characters long");
            }
            this.name = name;
            this.mobile = mobile;
            this.password = password;
        }
        catch(EmptyNameException | MobileNumberFormatException | PasswordFormatException e){
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Done");
        }
    }
}
class EmptyNameException extends Exception
{
    public EmptyNameException(String message)
    {
        super(message);
    }
}

class MobileNumberFormatException extends Exception
{
    public MobileNumberFormatException(String message)
    {
        super(message);
    }
}

class PasswordFormatException extends Exception
{
    public PasswordFormatException(String message)
    {
        super(message);
    }
}
public class Assignment_8
{
    public static void main(String[] args)
    {
        Employee customer = new Employee("supraja","9999999999","Abc@12n");
    }
}


