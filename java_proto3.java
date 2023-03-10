syntax = "proto3";

message ZKPRequest {
    uint64 number = 1;
    bytes commitment = 2;
}

message ZKPResponse {
    bool result = 1;
}

service ZKP {
    rpc Verify(ZKPRequest) returns (ZKPResponse);
}

// The ZKPRequest message contains two fields: number and commitment. The number field is the random number generated by the server, and the commitment field is the commitment generated by the server. The ZKPResponse message contains only one field result which is a boolean value indicating whether the client has provided the correct response or not. The ZKP service contains only one method Verify which takes a ZKPRequest message as input and returns a ZKPResponse message as output.


