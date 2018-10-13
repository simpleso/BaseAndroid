package top.andnux.library.annotation

@Target(allowedTargets = [AnnotationTarget.CLASS])
@Retention(AnnotationRetention.RUNTIME)
annotation class BindView(val value: Int)
