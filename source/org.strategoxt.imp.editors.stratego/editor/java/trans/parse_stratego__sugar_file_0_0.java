package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class parse_stratego__sugar_file_0_0 extends Strategy 
{ 
  public static parse_stratego__sugar_file_0_0 instance = new parse_stratego__sugar_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("parse_stratego__sugar_file_0_0");
    Fail21426:
    { 
      IStrategoTerm f_4197 = null;
      IStrategoTerm g_4197 = null;
      f_4197 = term;
      g_4197 = trans.constStrategoSugarTbl;
      term = parse_file_2_1.instance.invoke(context, f_4197, strsglr_perror_0_0.instance, strsglr_report_parse_error_0_0.instance, g_4197);
      if(term == null)
        break Fail21426;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}