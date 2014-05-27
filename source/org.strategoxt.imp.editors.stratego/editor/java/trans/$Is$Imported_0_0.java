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
    Fail23451:
    { 
      TermReference j_4841 = new TermReference();
      TermReference k_4841 = new TermReference();
      IStrategoTerm o_4841 = null;
      if(k_4841.value == null)
        k_4841.value = term;
      else
        if(k_4841.value != term && !k_4841.value.match(term))
          break Fail23451;
      if(j_4841.value == null)
        j_4841.value = term;
      else
        if(j_4841.value != term && !j_4841.value.match(term))
          break Fail23451;
      o_4841 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, o_4841, trans.const4537, k_4841.value);
      if(term == null)
        break Fail23451;
      lifted6993 lifted69930 = new lifted6993();
      lifted69930.j_4841 = j_4841;
      lifted69930.k_4841 = k_4841;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted69930);
      if(term == null)
        break Fail23451;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}