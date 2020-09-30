export class Eligibility {
    public name : string;
    public age : number;
    public gender : string;
    public mobileNo : string;
    public email : string;
    public emi : number;
    public vehicleType : string;
    public vehicleMake :string;
    public vehicleModel : string;
    public exShowroomPrice : number;
    public onRoadPrice : number;
    public employmentType : string;
    public annualIncome : string;
}

export class User {
    public name : string;
    public age : number;
    public gender : string;
    public mobileNo : string;
    public email : string;
    public password : string;
    public address : string;
    public state : string;
    public city : string;
    public pincode : string;
}

export class Employment {
    public employmentType : string;
    public annualIncome : number;
    public existingEmi : number;
}

export class Vehicle {
    public vehicleMake :string;
    public vehicleModel : string;
    public exShowroomPrice : number;
}

export class Loan {
    public loanAmount :number;
    public interestRate : number;
    public tenure : number;
    public loanStatus : string;
}

export class Identity {
    public aadhaarNo : string;
    public panNo : string;
}
