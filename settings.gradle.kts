rootProject.name = "HerzPlatform"

includeBuild("modules/module-eag-1_5_2")
includeBuild("modules/module-eag-1_8")
includeBuild("modules/module-eag-1_14")

include("mixin:mixin-loader")
include("mixin:mixins-1_5_2")
include("mixin:mixins-1_8")

project(":mixin:mixins-1_5_2").projectDir = file("mixin/type/eag/1_5_2")
project(":mixin:mixins-1_8").projectDir = file("mixin/type/eag/1_8")
