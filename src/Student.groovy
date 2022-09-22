class Student{
    String name
    def getName(){
        return name;
    }
}

def s = new Student()
s.name = "akash"
println s.getName()
