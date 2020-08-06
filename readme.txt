服务端 8001 8002为集群模式，都是服务提供者

客户端消费者 order80 调用微服务提供者payment8001，payment8002

cloud-api-commons 为通用工具包

横向调用1.使用restTemplate 单机模式，2.如果使用进群模式，直接调用在eureka中注册的服务名称