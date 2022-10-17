export default class Request{
    constructor(public requestId: number, public createdBy:string, public discription:string, public status:boolean,
        public date: Date, public type: string){}
    }