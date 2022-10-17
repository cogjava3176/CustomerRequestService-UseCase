import {HttpClient, HttpHeaders, HttpParams} from "@angular/common/http";
import {Injectable} from "@angular/core";
import {map, Observable} from "rxjs";

const API_URL="http://localhost:8091/user"

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private httpClient: HttpClient) {
  }

    PostUserRequest(request: Request){
    const requestId=3;
    return this.httpClient.post("http://localhost:8091/user/addRequest/", request)
  }

  GetUserRequest(data:any,id:number){
    return this.httpClient.get("http://localhost:8091/user/allRequest/"+id)
  }

  DeleteUserRequest(data:any,id:number){
    return this.httpClient.get("http://localhost:8091/user/deleteRequest/"+id)
  }

   UpdateUserRequest(data:any,id:number){
    return this.httpClient.get("http://localhost:8091/user/allRequest/"+id)
  }
  }

