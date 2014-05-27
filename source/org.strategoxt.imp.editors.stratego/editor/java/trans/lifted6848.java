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

@SuppressWarnings("all") final class lifted6848 extends Strategy 
{ 
  TermReference y_4776;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24063:
    { 
      IStrategoTerm term12402 = term;
      Success12756:
      { 
        Fail24064:
        { 
          IStrategoList annos711 = term.getAnnotations();
          if(annos711.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos711).isEmpty())
            break Fail24064;
          if(y_4776.value == null)
            y_4776.value = ((IStrategoList)annos711).head();
          else
            if(y_4776.value != ((IStrategoList)annos711).head() && !y_4776.value.match(((IStrategoList)annos711).head()))
              break Fail24064;
          IStrategoTerm arg8213 = ((IStrategoList)annos711).tail();
          if(arg8213.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8213).isEmpty())
            break Fail24064;
          if(true)
            break Success12756;
        }
        term = term12402;
        if(term.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)term).getConstructor())
          break Fail24063;
        IStrategoTerm arg8214 = term.getSubterm(0);
        IStrategoList annos712 = arg8214.getAnnotations();
        if(annos712.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos712).isEmpty())
          break Fail24063;
        if(y_4776.value == null)
          y_4776.value = ((IStrategoList)annos712).head();
        else
          if(y_4776.value != ((IStrategoList)annos712).head() && !y_4776.value.match(((IStrategoList)annos712).head()))
            break Fail24063;
        IStrategoTerm arg8215 = ((IStrategoList)annos712).tail();
        if(arg8215.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8215).isEmpty())
          break Fail24063;
      }
      if(true)
        return term;
    }
    return null;
  }
}