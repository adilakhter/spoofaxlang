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

@SuppressWarnings("all") public class $Is$Imported$Failed_0_0 extends Strategy 
{ 
  public static $Is$Imported$Failed_0_0 instance = new $Is$Imported$Failed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("IsImportedFailed_0_0");
    Fail23683:
    { 
      TermReference s_4880 = new TermReference();
      TermReference t_4880 = new TermReference();
      IStrategoTerm x_4880 = null;
      if(t_4880.value == null)
        t_4880.value = term;
      else
        if(t_4880.value != term && !t_4880.value.match(term))
          break Fail23683;
      if(s_4880.value == null)
        s_4880.value = term;
      else
        if(s_4880.value != term && !s_4880.value.match(term))
          break Fail23683;
      x_4880 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, x_4880, trans.const4576, t_4880.value);
      if(term == null)
        break Fail23683;
      lifted7074 lifted70740 = new lifted7074();
      lifted70740.s_4880 = s_4880;
      lifted70740.t_4880 = t_4880;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted70740);
      if(term == null)
        break Fail23683;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}