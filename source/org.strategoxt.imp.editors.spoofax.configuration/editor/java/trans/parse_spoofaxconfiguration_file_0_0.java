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

@SuppressWarnings("all") public class parse_spoofaxconfiguration_file_0_0 extends Strategy 
{ 
  public static parse_spoofaxconfiguration_file_0_0 instance = new parse_spoofaxconfiguration_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("parse_spoofaxconfiguration_file_0_0");
    Fail22834:
    { 
      IStrategoTerm k_4619 = null;
      IStrategoTerm l_4619 = null;
      k_4619 = term;
      l_4619 = trans.constSpoofaxConfigurationTbl;
      term = parse_file_2_1.instance.invoke(context, k_4619, strsglr_perror_0_0.instance, strsglr_report_parse_error_0_0.instance, l_4619);
      if(term == null)
        break Fail22834;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}