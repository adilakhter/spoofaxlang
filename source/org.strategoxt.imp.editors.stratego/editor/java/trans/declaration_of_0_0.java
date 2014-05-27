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

@SuppressWarnings("all") public class declaration_of_0_0 extends Strategy 
{ 
  public static declaration_of_0_0 instance = new declaration_of_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("declaration_of_0_0");
    Fail21590:
    { 
      term = signature_of_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21590;
      IStrategoTerm term11686 = term;
      Success11611:
      { 
        Fail21591:
        { 
          IStrategoTerm b_4221 = null;
          IStrategoList annos680 = term.getAnnotations();
          if(annos680.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos680).isEmpty())
            break Fail21591;
          b_4221 = ((IStrategoList)annos680).head();
          IStrategoTerm arg7738 = ((IStrategoList)annos680).tail();
          if(arg7738.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7738).isEmpty())
            break Fail21591;
          term = $Declaration_0_0.instance.invoke(context, b_4221);
          if(term == null)
            break Fail21591;
          if(true)
            break Success11611;
        }
        term = term11686;
        IStrategoTerm term11687 = term;
        Success11612:
        { 
          Fail21592:
          { 
            IStrategoTerm c_4221 = null;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
              break Fail21592;
            IStrategoTerm arg7739 = term.getSubterm(0);
            IStrategoList annos681 = arg7739.getAnnotations();
            if(annos681.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos681).isEmpty())
              break Fail21592;
            c_4221 = ((IStrategoList)annos681).head();
            IStrategoTerm arg7740 = ((IStrategoList)annos681).tail();
            if(arg7740.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7740).isEmpty())
              break Fail21592;
            term = $Declaration_0_0.instance.invoke(context, c_4221);
            if(term == null)
              break Fail21592;
            if(true)
              break Success11612;
          }
          term = term11687;
          IStrategoTerm d_4221 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
            break Fail21590;
          IStrategoTerm arg7742 = term.getSubterm(0);
          IStrategoList annos682 = arg7742.getAnnotations();
          if(annos682.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos682).isEmpty())
            break Fail21590;
          d_4221 = ((IStrategoList)annos682).head();
          IStrategoTerm arg7743 = ((IStrategoList)annos682).tail();
          if(arg7743.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7743).isEmpty())
            break Fail21590;
          term = $Declaration_0_0.instance.invoke(context, d_4221);
          if(term == null)
            break Fail21590;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}