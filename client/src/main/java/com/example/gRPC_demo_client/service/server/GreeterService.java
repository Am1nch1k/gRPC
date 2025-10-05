package com.example.gRPC_demo_client.service.server;

import io.grpc.stub.StreamObserver;
import com.example.HelloworldProto;
import com.example.GreeterGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GreeterService extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(HelloworldProto.HelloRequest request,
                         StreamObserver<HelloworldProto.HelloReply> responseObserver) {
        System.out.println("Server received: " + request.getName());

        String message = "Hello, " + request.getName() + "! Welcome to gRPC server!";

        HelloworldProto.HelloReply reply = HelloworldProto.HelloReply.newBuilder()
                .setMessage(message)
                .build();

        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void sayHelloAgain(HelloworldProto.HelloRequest request,
                              StreamObserver<HelloworldProto.HelloReply> responseObserver) {
        System.out.println("Server received (again): " + request.getName());

        String message = "Hello again, " + request.getName() + "! Nice to see you back!";

        HelloworldProto.HelloReply reply = HelloworldProto.HelloReply.newBuilder()
                .setMessage(message)
                .build();

        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}