# annosaurus-java-sdk

This is a client SDK for interacting with the [annosaurus](https://github.com/mbari-org/annosaurus) microservice. It's mostly auto-generated using [Kiota](https://learn.microsoft.com/en-us/openapi/kiota/overview).



## To regenerate the SDK

1. Copy the open api yaml file into each project's src/main/resources folder as docs.yaml
2. Some may need the openapi version changed to 3.0.0 as kiota does not support 3.1.0
3. Run the following command in the project's root directory

```shell
kiota generate -l java -c Annosaurus -n org.mbari.vars.annosaurus.sdk.kiota -d src/main/resources/docs.yaml -o ./src/main/java/org/mbari/vars/annosaurius/sdk/kiota
```
