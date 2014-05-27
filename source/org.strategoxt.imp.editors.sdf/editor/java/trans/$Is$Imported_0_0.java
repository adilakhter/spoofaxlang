package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
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
    Fail76162:
    { 
      TermReference u_92084 = new TermReference();
      TermReference v_92084 = new TermReference();
      IStrategoTerm z_92084 = null;
      if(v_92084.value == null)
        v_92084.value = term;
      else
        if(v_92084.value != term && !v_92084.value.match(term))
          break Fail76162;
      if(u_92084.value == null)
        u_92084.value = term;
      else
        if(u_92084.value != term && !u_92084.value.match(term))
          break Fail76162;
      z_92084 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, z_92084, trans.const15450, v_92084.value);
      if(term == null)
        break Fail76162;
      lifted21604 lifted216040 = new lifted21604();
      lifted216040.u_92084 = u_92084;
      lifted216040.v_92084 = v_92084;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted216040);
      if(term == null)
        break Fail76162;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}