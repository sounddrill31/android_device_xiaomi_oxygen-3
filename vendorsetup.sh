#Cherry Pick "arm64: dts: qcom: msm8953: disable dwc3 node" https://github.com/halibw/kernel_msm8953_4.19/commit/485262cecb7eaf47d06491c839dbd42ad44d854d
cd kernel/xiaomi/oxygen; \
git fetch https://github.com/halibw/kernel_msm8953_4.19.git 485262cecb7eaf47d06491c839dbd42ad44d854d; \
git cherry-pick 485262c; \
cd ../../..