#build with microg support built-in
rm -rf vendor/partner_gms

git clone https://github.com/lineageos4microg/android_vendor_partner_gms vendor/partner_gms

export WITH_GMS=true