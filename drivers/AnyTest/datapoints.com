<?xml version="1.0" encoding="UTF-8"?>
<CalculationConfiguration>
  <calculations>
    <calc>
      <target ns="bichler.tech" id="i=21253" name="Increment" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21253" name="ns=1;i=21253" index="-1"/>
      <operation value="+ 1);" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21254" name="Result" index="-1"/>
      <active value="true" />
      <calcevent value="VALUECHANGE" timeout="0"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21253" name="ns=1;i=21253" index="-1"/>
      <operation value="/10);" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21255" name="Signal" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(!" />
      <node ns="bichler.tech" id="i=21255" name="ns=1;i=21255" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21247" name="" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21245" name="ns=1;i=21245" index="-1"/>
      <operation value="+" />
      <node ns="bichler.tech" id="i=21246" name="ns=1;i=21246" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21243" name="" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="if(" />
      <node ns="bichler.tech" id="i=21241" name="ns=1;i=21241" index="-1"/>
      <operation value=")return(22);else if(" />
      <node ns="bichler.tech" id="i=21242" name="ns=1;i=21242" index="-1"/>
      <operation value=") return(55);" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21252" name="" index="-1"/>
      <active value="true" />
      <calcevent value="VALUECHANGE" timeout="0"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21243" name="ns=1;i=21243" index="-1"/>
      <operation value="*2.5);" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21252" name="" index="-1"/>
      <active value="true" />
      <calcevent value="VALUECHANGE" timeout="0"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21253" name="ns=1;i=21253" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21251" name="" index="-1"/>
      <active value="true" />
      <calcevent value="ONREAD" timeout="0"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21249" name="ns=1;i=21249" index="-1"/>
      <operation value="+" />
      <node ns="bichler.tech" id="i=21250" name="ns=1;i=21250" index="-1"/>
      <operation value=");" />
    </calc>
  </calculations>
</CalculationConfiguration>
