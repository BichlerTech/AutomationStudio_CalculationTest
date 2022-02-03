<?xml version="1.0" encoding="UTF-8"?>
<CalculationConfiguration>
  <calculations>
    <calc>
      <target ns="bichler.tech" id="i=3" name="" index="-1"/>
      <active value="false" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=3" name="ns=1;i=3" index="-1"/>
      <operation value="+ 1);" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=1" name="" index="-1"/>
      <active value="false" />
      <calcevent value="VALUECHANGE" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=3" name="ns=1;i=3" index="-1"/>
      <operation value="/10);" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=2" name="" index="-1"/>
      <active value="false" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(!" />
      <node ns="bichler.tech" id="i=2" name="ns=1;i=2" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=8" name="" index="-1"/>
      <active value="false" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=6" name="ns=1;i=6" index="-1"/>
      <operation value="+" />
      <node ns="bichler.tech" id="i=7" name="ns=1;i=7" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=5" name="" index="-1"/>
      <active value="false" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="if(" />
      <node ns="bichler.tech" id="i=9" name="ns=1;i=9" index="-1"/>
      <operation value=")return(22);else if(" />
      <node ns="bichler.tech" id="i=10" name="ns=1;i=10" index="-1"/>
      <operation value=") return(55);" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=11" name="output2" index="-1"/>
      <active value="false" />
      <calcevent value="VALUECHANGE" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=5" name="ns=1;i=5" index="-1"/>
      <operation value="*2.5);" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=11" name="output2" index="-1"/>
      <active value="false" />
      <calcevent value="VALUECHANGE" timeout="-1"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=3" name="ns=1;i=3" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=12" name="onreadResult" index="-1"/>
      <active value="false" />
      <calcevent value="ONREAD" timeout="-1"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=13" name="ns=1;i=13" index="-1"/>
      <operation value="+" />
      <node ns="bichler.tech" id="i=14" name="ns=1;i=14" index="-1"/>
      <operation value=");" />
    </calc>
  </calculations>
</CalculationConfiguration>
