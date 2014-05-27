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

@SuppressWarnings("all") public class bagof_$Is$Imported_0_0 extends Strategy 
{ 
  public static bagof_$Is$Imported_0_0 instance = new bagof_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_IsImported_0_0");
    Fail87832:
    { 
      TermReference o_17589 = new TermReference();
      TermReference p_17589 = new TermReference();
      if(p_17589.value == null)
        p_17589.value = term;
      else
        if(p_17589.value != term && !p_17589.value.match(term))
          break Fail87832;
      if(o_17589.value == null)
        o_17589.value = term;
      else
        if(o_17589.value != term && !o_17589.value.match(term))
          break Fail87832;
      Success47317:
      { 
        Fail87833:
        { 
          IStrategoTerm t_17589 = null;
          t_17589 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, t_17589, trans.const17874, p_17589.value);
          if(term == null)
            break Fail87833;
          if(true)
            break Success47317;
        }
        term = trans.constNil14;
      }
      lifted24795 lifted247950 = new lifted24795();
      lifted247950.o_17589 = o_17589;
      lifted247950.p_17589 = p_17589;
      term = filter_1_0.instance.invoke(context, term, lifted247950);
      if(term == null)
        break Fail87832;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}