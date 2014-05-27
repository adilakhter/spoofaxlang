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

@SuppressWarnings("all") public class $Is$No$Conflict_0_0 extends Strategy 
{ 
  public static $Is$No$Conflict_0_0 instance = new $Is$No$Conflict_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("IsNoConflict_0_0");
    Fail22312:
    { 
      TermReference e_4344 = new TermReference();
      TermReference f_4344 = new TermReference();
      IStrategoTerm j_4344 = null;
      if(f_4344.value == null)
        f_4344.value = term;
      else
        if(f_4344.value != term && !f_4344.value.match(term))
          break Fail22312;
      if(e_4344.value == null)
        e_4344.value = term;
      else
        if(e_4344.value != term && !e_4344.value.match(term))
          break Fail22312;
      j_4344 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, j_4344, trans.const4427, f_4344.value);
      if(term == null)
        break Fail22312;
      lifted6840 lifted68400 = new lifted6840();
      lifted68400.e_4344 = e_4344;
      lifted68400.f_4344 = f_4344;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted68400);
      if(term == null)
        break Fail22312;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}