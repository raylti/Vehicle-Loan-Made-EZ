export class Eligibility {
    public name : string;
    public exPrice : number;
    public onRoadPrice : number;
    public age : number;
    public mobileNo : number;
    public email : string;
}

export class User {
    public name : string;
    public age : number;
    public gender : string;
    public mobileNo : number;
    public email : string;
    public password : string;
    public address : string;
    public state : string;
    public city : string;
    public pincode : number;
}

export class Employment {
    public employmentType : string;
    public annualSal : number;
    public existingEmi : number;
}

export class Vehicle {
    public carMake :string;
    public carModel : string;
    public exPrice : number;
}

export class Loan {
    public loanAmount :number;
    public interestRate : number;
    public tenure : number;
}

export class Identity {
    public aadhaar : string;
    public pan : string;
    public photo : string;
    public salarySlip : string;
}
