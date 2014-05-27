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

@SuppressWarnings("all") final class lifted6753 extends Strategy 
{ 
  public static final lifted6753 instance = new lifted6753();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24184:
    { 
      IStrategoTerm term12168 = term;
      Success12820:
      { 
        Fail24185:
        { 
          IStrategoTerm term12169 = term;
          Success12821:
          { 
            Fail24186:
            { 
              term = is_spoofax_dir_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail24186;
              { 
                if(true)
                  break Fail24185;
                if(true)
                  break Success12821;
              }
            }
            term = term12169;
          }
          if(true)
            break Success12820;
        }
        term = term12168;
        IStrategoTerm l_4731 = null;
        IStrategoTerm b_4731 = null;
        IStrategoTerm d_4731 = null;
        IStrategoTerm e_4731 = null;
        l_4731 = term;
        term = project_path_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail24184;
        IStrategoTerm term12170 = term;
        Success12822:
        { 
          Fail24187:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail24187;
            if(true)
              break Success12822;
          }
          term = term12170;
          IStrategoTerm term12171 = term;
          Success12823:
          { 
            Fail24188:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail24188;
              if(true)
                break Success12823;
            }
            term = term12171;
            IStrategoTerm term12172 = term;
            Success12824:
            { 
              Fail24189:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail24189;
                if(true)
                  break Success12824;
              }
              term = term12172;
              IStrategoTerm term12173 = term;
              Success12825:
              { 
                Fail24190:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail24190;
                  if(true)
                    break Success12825;
                }
                term = term12173;
                IStrategoTerm x_4730 = null;
                IStrategoTerm y_4730 = null;
                IStrategoTerm a_4731 = null;
                x_4730 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail24184;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail24184;
                y_4730 = ((IStrategoList)term).tail();
                a_4731 = y_4730;
                term = report_failure_0_2.instance.invoke(context, a_4731, trans.const4468, x_4730);
                if(term == null)
                  break Fail24184;
              }
            }
          }
        }
        d_4731 = term;
        b_4731 = trans.const4440;
        e_4731 = d_4731;
        term = string_replace_0_2.instance.invoke(context, e_4731, b_4731, trans.const4440);
        if(term == null)
          break Fail24184;
        term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2046);
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail24184;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
        term = equal_0_1.instance.invoke(context, l_4731, term);
        if(term == null)
          break Fail24184;
      }
      if(true)
        return term;
    }
    return null;
  }
}