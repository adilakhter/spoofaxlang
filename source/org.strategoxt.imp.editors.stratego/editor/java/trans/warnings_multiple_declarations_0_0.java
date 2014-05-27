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

@SuppressWarnings("all") public class warnings_multiple_declarations_0_0 extends Strategy 
{ 
  public static warnings_multiple_declarations_0_0 instance = new warnings_multiple_declarations_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("warnings_multiple_declarations_0_0");
    Fail21306:
    { 
      TermReference x_4171 = new TermReference();
      TermReference y_4171 = new TermReference();
      IStrategoTerm z_4171 = null;
      IStrategoTerm a_4172 = null;
      IStrategoTerm b_4172 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21306;
      IStrategoTerm arg7606 = term.getSubterm(0);
      if(arg7606.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)arg7606).getConstructor())
        break Fail21306;
      IStrategoTerm arg7607 = arg7606.getSubterm(0);
      if(x_4171.value == null)
        x_4171.value = arg7607;
      else
        if(x_4171.value != arg7607 && !x_4171.value.match(arg7607))
          break Fail21306;
      IStrategoList annos668 = arg7607.getAnnotations();
      if(annos668.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos668).isEmpty())
        break Fail21306;
      if(y_4171.value == null)
        y_4171.value = ((IStrategoList)annos668).head();
      else
        if(y_4171.value != ((IStrategoList)annos668).head() && !y_4171.value.match(((IStrategoList)annos668).head()))
          break Fail21306;
      IStrategoTerm arg7608 = ((IStrategoList)annos668).tail();
      if(arg7608.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7608).isEmpty())
        break Fail21306;
      z_4171 = term.getSubterm(1);
      term = z_4171;
      lifted6454 lifted64540 = new lifted6454();
      lifted64540.x_4171 = x_4171;
      lifted64540.y_4171 = y_4171;
      term = collect_all_1_0.instance.invoke(context, term, lifted64540);
      if(term == null)
        break Fail21306;
      a_4172 = term;
      Success11450:
      { 
        Fail21307:
        { 
          IStrategoTerm c_4172 = null;
          c_4172 = term;
          term = a_4172;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail21307;
          IStrategoTerm arg7618 = ((IStrategoList)term).tail();
          if(arg7618.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg7618).isEmpty())
            break Fail21307;
          term = c_4172;
          { 
            term = map_1_0.instance.invoke(context, a_4172, lifted6455.instance);
            if(term == null)
              break Fail21306;
            b_4172 = term;
            if(true)
              break Success11450;
          }
        }
        term = trans.constNil3;
        b_4172 = trans.constNil3;
      }
      term = b_4172;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}