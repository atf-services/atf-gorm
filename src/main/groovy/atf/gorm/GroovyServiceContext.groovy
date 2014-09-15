package atf.gorm

import atf.api.PersonService
import atf.api.ServiceContext
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan

@ComponentScan
@EnableAutoConfiguration
class GroovyServiceContext implements ServiceContext {

    static serviceContext

    static ServiceContext getServiceContext() {
        if(serviceContext == null) {
            def ctx = new AnnotationConfigApplicationContext(GroovyServiceContext.class)
            serviceContext = new GroovyServiceContext(ctx)
        }
        return serviceContext
    }

    def ctx

    GroovyServiceContext() {}

    GroovyServiceContext(ctx) {
        this.ctx = ctx
    }

    @Override
    PersonService getPersonService() {
        return ctx.getBean("personService")
    }


}
