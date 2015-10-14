# samples
examples

* Checkout the project.
* Run on a server which supports EE applications - preferably liberty webspher/ glassfish/tomEE etc
* [Eg: Tomcat requires additional configuration to run the restful webservices]
* Open soap UI > File> new REST project >
    Give URI as "http://localhost:9080/samplemdc/rest/info/retrieveCustomerDetails"
* A request interface will be generated.
* Ensure that METHOD is selected as POST.
* Ensure that MediaType is selected one among: { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_HTML, MediaType.TEXT_XML }
* Consider the following sample request:
```HTML
        <sampleObject>
            <line>example</line>
        </sampleObject>
```
* Once the request is sent, observe the loggers in the console.
