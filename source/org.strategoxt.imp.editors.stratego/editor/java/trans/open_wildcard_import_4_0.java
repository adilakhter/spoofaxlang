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

@SuppressWarnings("all") public class open_wildcard_import_4_0 extends Strategy 
{ 
  public static open_wildcard_import_4_0 instance = new open_wildcard_import_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4753, Strategy r_4753, Strategy s_4753, Strategy t_4753)
  { 
    context.push("open_wildcard_import_4_0");
    Fail22915:
    { 
      IStrategoTerm t_4752 = null;
      TermReference u_4752 = new TermReference();
      TermReference v_4752 = new TermReference();
      t_4752 = term;
      IStrategoTerm term12273 = term;
      Success12218:
      { 
        Fail22916:
        { 
          IStrategoTerm w_4752 = null;
          w_4752 = term;
          IStrategoTerm term12274 = term;
          Success12219:
          { 
            Fail22917:
            { 
              term = t_4752;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
                break Fail22917;
              { 
                if(true)
                  break Fail22916;
                if(true)
                  break Success12219;
              }
            }
            term = term12274;
          }
          term = w_4752;
          { 
            term = q_4753.invoke(context, t_4752);
            if(term == null)
              break Fail22915;
            if(u_4752.value == null)
              u_4752.value = term;
            else
              if(u_4752.value != term && !u_4752.value.match(term))
                break Fail22915;
            term = readdir_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22915;
            lifted6809 lifted68090 = new lifted6809();
            lifted68090.t_4753 = t_4753;
            lifted68090.r_4753 = r_4753;
            lifted68090.s_4753 = s_4753;
            lifted68090.u_4752 = u_4752;
            lifted68090.v_4752 = v_4752;
            term = list_loop_1_0.instance.invoke(context, term, lifted68090);
            if(term == null)
              break Fail22915;
            IStrategoTerm term12285 = term;
            Success12220:
            { 
              Fail22918:
              { 
                if(v_4752.value == null)
                  break Fail22918;
                term = v_4752.value;
                { 
                  if(true)
                    break Fail22915;
                  if(true)
                    break Success12220;
                }
              }
              term = term12285;
            }
            if(true)
              break Success12218;
          }
        }
        term = term12273;
      }
      term = t_4752;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}