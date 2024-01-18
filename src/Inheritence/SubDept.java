package Inheritence;

class SubDept extends Department{
    private int departmentSize;
    public SubDept(int departmentSize) {
        this.departmentSize = departmentSize;
    }

    @Override
    public int getDepartmentSize() {
        return departmentSize;
    }
}
