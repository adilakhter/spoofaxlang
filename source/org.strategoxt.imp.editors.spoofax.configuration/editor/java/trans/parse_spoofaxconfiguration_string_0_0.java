package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class parse_spoofaxconfiguration_string_0_0 extends Strategy 
{ 
  public static parse_spoofaxconfiguration_string_0_0 instance = new parse_spoofaxconfiguration_string_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("parse_spoofaxconfiguration_string_0_0");
    Fail22836:
    { 
      IStrategoTerm o_4619 = null;
      IStrategoTerm p_4619 = null;
      o_4619 = term;
      p_4619 = trans.constSpoofaxConfigurationTbl0;
      term = parse_string_1_1.instance.invoke(context, o_4619, strsglr_report_parse_error_0_0.instance, p_4619);
      if(term == null)
        break Fail22836;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}