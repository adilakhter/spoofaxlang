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

@SuppressWarnings("all") public class $Is$Imported_0_0 extends Strategy 
{ 
  public static $Is$Imported_0_0 instance = new $Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("IsImported_0_0");
    Fail21975:
    { 
      TermReference r_4287 = new TermReference();
      TermReference s_4287 = new TermReference();
      IStrategoTerm w_4287 = null;
      if(s_4287.value == null)
        s_4287.value = term;
      else
        if(s_4287.value != term && !s_4287.value.match(term))
          break Fail21975;
      if(r_4287.value == null)
        r_4287.value = term;
      else
        if(r_4287.value != term && !r_4287.value.match(term))
          break Fail21975;
      w_4287 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, w_4287, trans.const4327, s_4287.value);
      if(term == null)
        break Fail21975;
      lifted6722 lifted67220 = new lifted6722();
      lifted67220.r_4287 = r_4287;
      lifted67220.s_4287 = s_4287;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted67220);
      if(term == null)
        break Fail21975;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}