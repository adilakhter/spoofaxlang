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

@SuppressWarnings("all") public class parse_stratego__sugar_stream_0_0 extends Strategy 
{ 
  public static parse_stratego__sugar_stream_0_0 instance = new parse_stratego__sugar_stream_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("parse_stratego__sugar_stream_0_0");
    Fail22906:
    { 
      IStrategoTerm f_4751 = null;
      IStrategoTerm g_4751 = null;
      f_4751 = term;
      g_4751 = trans.constStrategoSugarTbl1;
      term = parse_stream_1_1.instance.invoke(context, f_4751, strsglr_report_parse_error_0_0.instance, g_4751);
      if(term == null)
        break Fail22906;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}