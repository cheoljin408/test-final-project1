package org.kosta.cosmos.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

public class MemberDTO {

    private int empNo;
    private String eName;
    private String sal;
    private int deptNo;

    public MemberDTO(int empNo, String eName, String sal, int deptNo) {
        this.empNo = empNo;
        this.eName = eName;
        this.sal = sal;
        this.deptNo = deptNo;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }
}
