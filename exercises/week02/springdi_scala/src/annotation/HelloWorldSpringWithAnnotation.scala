package annotation

import org.springframework.beans.factory.BeanFactory
import org.springframework.context.support.ClassPathXmlApplicationContext

object HelloWorldSpringWithAnnotation extends App {
  @throws(classOf[Exception])
  val factory: BeanFactory = getBeanFactory
  val mr: MessageRenderer = factory.getBean("renderer").asInstanceOf[MessageRenderer]
  mr.render

  @throws(classOf[Exception])
  private def getBeanFactory: BeanFactory = {
    new ClassPathXmlApplicationContext("anno.xml")
  }
}
