<?xml version="1.0" encoding="UTF-8"?>
<CalculationConfiguration>
  <calculations>
    <calc>
      <target ns="bichler.tech" id="i=21396" name="UInt64Result1" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21380" name="ns=1;i=21380" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21390" name="UInt64Result2" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21389" name="ns=1;i=21389" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21384" name="UInt64Result3" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21386" name="ns=1;i=21386" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21397" name="UInt64Result4" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21379" name="ns=1;i=21379" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21392" name="UInt64Result5" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21385" name="ns=1;i=21385" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21445" name="UInt64Result6" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21383" name="ns=1;i=21383" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21398" name="UInt64Result7" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21395" name="ns=1;i=21395" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21387" name="UInt64Result8" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21394" name="ns=1;i=21394" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21388" name="UInt64Result9" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21391" name="ns=1;i=21391" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21381" name="UInt64Result10" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21382" name="ns=1;i=21382" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21378" name="UInt64Result11" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21393" name="ns=1;i=21393" index="-1"/>
      <operation value=");" />
    </calc>
  </calculations>
</CalculationConfiguration>
