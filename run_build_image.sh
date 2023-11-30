#/bin/sh

mvn clean install && mvn package && docker build -t minsait/hexagon-product-service:latest .
