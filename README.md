# 

<p align="center">
  <a href="https://spring.io/projects/spring-boot" target="blank">
    <svg xmlns="http://www.w3.org/2000/svg" x="0px" y="0px" width="100" height="100" viewBox="0 0 48 48">
    <path fill="#8bc34a" d="M43.982,23.635c0.069-4.261-0.891-9.328-2.891-15.273l-1.568-4.662l-2.13,4.433 c-0.114,0.237-0.244,0.469-0.38,0.698C33.514,5.827,28.974,4,24,4C12.954,4,4,12.954,4,24c0,11.046,8.954,20,20,20s20-8.954,20-20 C44,23.877,43.984,23.758,43.982,23.635z"></path><path fill="#fff" d="M39.385 32.558c-3.123 4.302-8.651 4.533-13.854 4.442H18.75h-1.938c4.428-1.593 7.063-1.972 9.754-3.4 5.068-2.665 10.078-8.496 11.121-14.562-1.93 5.836-7.779 10.85-13.109 12.889-3.652 1.393-10.248 2.745-10.248 2.745l-.267-.145C9.573 32.268 9.437 22.214 17.6 18.968c3.574-1.423 6.993-.641 10.854-1.593 4.122-1.012 8.89-4.208 10.83-8.375C41.456 15.667 44.07 26.106 39.385 32.558L39.385 32.558zM15.668 38.445C15.386 38.795 14.955 39 14.505 39c-.823 0-1.495-.677-1.495-1.5s.677-1.5 1.495-1.5c.341 0 .677.118.941.336C16.086 36.855 16.186 37.805 15.668 38.445L15.668 38.445z"></path>
    </svg>
  </a>
</p>

[circleci-image]: https://img.shields.io/circleci/build/github/nestjs/nest/master?token=abc123def456
[circleci-url]: https://circleci.com/gh/nestjs/nest

# Backend Side Minsait-hexangon-product-service

## [:construction: Go to Project Dashboard](https://github.com/users/92Sam/projects/4)

## :construction: Stack
- Hexagonal pattern
- Java 17
- SpringBoot 3.2
- Docker
- Database Memory H2

## Run Project 

In the project directory could your run the following archive
```sh
 ./run_build_image.sh
```



## :warning: To run the project it is mandatory to have the following programs
- [Docker](https://www.docker.com/products/docker-desktop/)

## Run project

In the project directory, you can run the docker image generated 
```sh
  docker run -it --rm -p 8080:8080 minsait/hexagon-product-service:latest
```

## Runs the app
- Open [http://localhost:8080/api/v1](http://localhost:8080/api/v1) to view the API-REST in the browser or postman.

## Structure Folder
```
.application/target
├── application-0.0.1-SNAPSHOT.jar
├── classes
│   └── com
│       └── minsait
│           └── demohexagon
│               └── application
│                   ├── config
│                   │   └── ApplicationConfig.class
│                   └── services
│                       ├── BrandService.class
│                       ├── PriceService.class
│                       └── impl
│                           └── PriceServiceImpl.class
├── generated-sources
│   └── annotations
├── generated-test-sources
│   └── test-annotations
├── maven-archiver
│   └── pom.properties
├── maven-status
│   └── maven-compiler-plugin
│       ├── compile
│       │   └── default-compile
│       │       ├── createdFiles.lst
│       │       └── inputFiles.lst
│       └── testCompile
│           └── default-testCompile
│               ├── createdFiles.lst
│               └── inputFiles.lst
└── test-classes
boot/target
├── boot-0.0.1-SNAPSHOT.jar
├── classes
│   ├── application.yml
│   ├── bootstrap.yml
│   └── com
│       └── minsait
│           └── demohexagon
│               └── boot
│                   └── BootApplication.class
├── generated-sources
│   └── annotations
├── generated-test-sources
│   └── test-annotations
├── maven-archiver
│   └── pom.properties
├── maven-status
│   └── maven-compiler-plugin
│       ├── compile
│       │   └── default-compile
│       │       ├── createdFiles.lst
│       │       └── inputFiles.lst
│       └── testCompile
│           └── default-testCompile
│               ├── createdFiles.lst
│               └── inputFiles.lst
├── surefire-reports
│   ├── TEST-com.minsait.demohexagon.boot.BootApplicationTests.xml
│   └── com.minsait.demohexagon.boot.BootApplicationTests.txt
└── test-classes
    └── com
        └── minsait
            └── demohexagon
                └── boot
                    └── BootApplicationTests.class
domain/target
├── classes
│   └── com
│       └── minsait
│           └── demohexagon
│               └── domain
│                   ├── entity
│                   │   ├── Brand$BrandBuilder.class
│                   │   ├── Brand.class
│                   │   ├── Price$PriceBuilder.class
│                   │   └── Price.class
│                   ├── enums
│                   │   └── Priority.class
│                   ├── exception
│                   │   ├── CustomException.class
│                   │   ├── ErrorResponseStatus.class
│                   │   ├── PriceNotFoundException.class
│                   │   └── RecordNotFoundException.class
│                   └── port
│                       ├── inbound
│                       │   └── PriceInboundPort.class
│                       └── outbound
│                           └── PriceOutboundPort.class
├── domain-0.0.1-SNAPSHOT.jar
├── generated-sources
│   └── annotations
├── generated-test-sources
│   └── test-annotations
├── maven-archiver
│   └── pom.properties
├── maven-status
│   └── maven-compiler-plugin
│       ├── compile
│       │   └── default-compile
│       │       ├── createdFiles.lst
│       │       └── inputFiles.lst
│       └── testCompile
│           └── default-testCompile
│               ├── createdFiles.lst
│               └── inputFiles.lst
└── test-classes
infrastructure/target
├── classes
│   └── com
│       └── minsait
│           └── demohexagon
│               └── infrastructure
│                   ├── adapters
│                   │   ├── inbound
│                   │   │   └── apirest
│                   │   │       ├── PriceController.class
│                   │   │       ├── dto
│                   │   │       │   ├── BrandReqDTO.class
│                   │   │       │   ├── BrandResDTO.class
│                   │   │       │   ├── PriceReqDTO.class
│                   │   │       │   ├── PriceResDTO$PriceResDTOBuilder.class
│                   │   │       │   └── PriceResDTO.class
│                   │   │       └── mappers
│                   │   │           ├── BrandMapper.class
│                   │   │           └── PriceMapper.class
│                   │   └── outbound
│                   │       ├── H2PriceAdapter.class
│                   │       └── persistence
│                   │           ├── entity
│                   │           │   ├── Brand$BrandBuilder.class
│                   │           │   ├── Brand.class
│                   │           │   └── Price.class
│                   │           ├── mappers
│                   │           │   └── ProductMapper.class
│                   │           └── repository
│                   │               └── H2PriceRepository.class
│                   └── config
│                       └── InfrastructureConfig.class
├── generated-sources
│   └── annotations
├── generated-test-sources
│   └── test-annotations
├── infrastructure-0.0.1-SNAPSHOT.jar
├── maven-archiver
│   └── pom.properties
├── maven-status
│   └── maven-compiler-plugin
│       ├── compile
│       │   └── default-compile
│       │       ├── createdFiles.lst
│       │       └── inputFiles.lst
│       └── testCompile
│           └── default-testCompile
│               ├── createdFiles.lst
│               └── inputFiles.lst
└── test-classes
```
