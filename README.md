# DaggerApplication

Dagger is a fully static, compile-time dependency injection framework for Android.

Dagger 2 uses the following annotations:

@Module and @Provides: define classes and methods which provide dependencies

@Inject: request dependencies. Can be used on a constructor, a field, or a method

@Component: enable selected modules and used for performing dependency injection

In Dagger it is not allowed to use private fields for field injection as Dagger 2 uses generated code to access the fields and not reflection.

In Dagger 2, classes annotated with @Module are responsible for providing objects which can be injected. Such classes can define methods annotated with @Provides. The returned objects from these methods are available for dependency injection.

Methods annotated with @Provides can also express dependencies via method parameters. These dependencies are fulfilled by Dagger 2, if possible.

A @Component interface defines the connection between provider of objects (modules) and the objects which expresses a dependency. The following table gives an overview of the usage of the Dagger annotations.

Kindly go through the demo app for Dagger2 implementation with @Module,@Provides,@Component,@Singleton 
